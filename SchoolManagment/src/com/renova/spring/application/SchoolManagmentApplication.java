package com.renova.spring.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renova.spring.domain.HeadMaster;
import com.renova.spring.domain.Student;
import com.renova.spring.domain.Teacher;
import com.renova.spring.system.HeadMasterManagment;

/*
 * Bu projedenin amacý okul içerisinde öðrenci, ögretmen adýna durum ve nicelik yönetim sistemidir.
 * Okul müdürü tarafýndan okula ögrenci ve öðretmen eklenebilir veya çýkartýlabilir.
 * Okul içerisinde öðrenciler derste veya tenefüste olabilirler, öðretmenler de öðrencilere ödev verip öðrencileri derse sokabilir.
 * Okul içerisindeki sistemi sonlandýrmak okulu kapatýlmasýna yol açar, okulu açýlýþý için okulda kesinlikle müdüre ihtiyaç vardýr.
 * */


public class SchoolManagmentApplication {

	static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
	static List<Student> studentList = new ArrayList<Student>();
	static List<Teacher> teacherList = new ArrayList<Teacher>();
	static int studentId = 0;
	static int teacherIndex = 0;
	static HeadMaster headMaster;

	public static void main(String[] args) {

		headMaster = context.getBean("headMaster", HeadMaster.class);
		Scanner scan = new Scanner(System.in);

		System.out.println("STUDENT MANAGMENT");
		System.out.println("Okul müdürünün ismini giriniz: ");
		headMaster.setName(scan.nextLine());
		headMaster.setStudentList(studentList);
		headMaster.setTeacherList(teacherList);

		int input = 1;

		while (input != 0) {
			System.out.println("0. CIKIS\n" + "1. OGRENCI EKLE\n" + "2. OGRENCI SEC\n" + "3. OGRENCI SIL\n"
					+ "4. OGRETMEN EKLE\n" + "5. OGRETMEN LISTELE\n" + "6. OGRETMEN SIL");
			input = scan.nextInt();

			switch (input) {
			case 0:
				context.registerShutdownHook();  //OKULU KAPATMAN ICIN CONTEXT DE KAPATILIR
				break;
			case 1:
				addStudent(); 
				break;
			case 2:
				chooseStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				addTeacher();
				break;
			case 5:
				chooseTeacher();
				break;
			case 6:
				deleteTeacher();
				break;
			default:
				System.out.println("Listedeki sayilardan birini giriniz...");
			}

		}

	}

	private static void deleteTeacher() {  //OGRETMENIN ADINI LISTEDEN ARAYIP VAR ISE SILINME ISLEMI YAPILIR

		Scanner scan = new Scanner(System.in);
		System.out.println("Ogretmen ismi giriniz");
		String input = scan.nextLine();

		if (teacherList.size() == 0) {
			System.out.println("Okulda ogretmen yok.");
		} else {
			for (int i = 0; i < teacherList.size(); i++) {
				if (input.equals(teacherList.get(i).getName())) {
					teacherList.remove(i);
					System.out.println(input + " adli ogretmen okuldan atilmistir.");
					break;
				}
			}
		}

		teacherIndex--;  //YENIDEN EKLENECEK OGRETMENIN INDEXI EKSRA FAZLA OLMAMASI ICIN BURADA AZALTILMISTIR
	}

	private static void chooseTeacher() { //LISTEDEKI OGRETMENLER GOSTERILIR

		System.out.println("Kayitli Ogretmenler: ");
		for (int i = 0; i < teacherList.size(); i++) {
			System.out.println(teacherList.get(i).getName() + " verdigi ders " + teacherList.get(i).getLecture());
		}

	}

	private static void addTeacher() { // LISTEYE OGRETMEN EKLEME ISLEMI YAPILIR, CONTEXTDEN KONFIGURASYONLAR ALINIR

		headMaster.getTeacherList().add(context.getBean("teacher", Teacher.class));

		Scanner scan = new Scanner(System.in);
		System.out.println("Isim giriniz: ");
		teacherList.get(teacherIndex).setName(scan.nextLine());
		System.out.println("Verecegi dersin ismini giriniz: ");
		teacherList.get(teacherIndex).setLecture(scan.nextLine());

		teacherIndex++;
	}

	private static void deleteStudent() { //OGRENCI NUMARASI GIRILEREK OGRENCI LISTEDEN SILINIR

		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrenci numarsini giriniz: ");
		int number = scan.nextInt();

		if (number >= studentId) {
			System.out.println("Bu numarada ogrenci bulunmamaktadir");
		} else {
			System.out.println(studentList.get(number).getName() + " adli ogrenci okuldan atilmistir.");
			studentList.remove(number);
		}

		studentId--;  //OGRENCI NUMARASI SILINEN OGRENCI KADAR AZALTILIR
	}

	private static void chooseStudent() { //OGRENCI NUMARASI GIRILEREK LISTEDEN OGRENCIYE AIT BILGILER EKRANDA GOSTERILIR
		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrenci numarsini giriniz: ");
		int number = scan.nextInt();

		if (number >= studentList.size()) {
			System.out.println("Bu numarada ogrenci bulunmamaktadir");
		} else {
			System.out.println("Ogrenci adi: " + studentList.get(number).getName());
			System.out.println("Ogrencinin numarasi: " + number);
			System.out.println("Ogrencinin yili: " + studentList.get(number).getYear());
			System.out.println("Ogrenicinin aldigi dersler: ");
			studentList.get(number).getLessons().forEach(System.out::println);
			if (studentList.get(number).isWork()) {
				System.out.println("Ogrenci su anda derste.");
			} else {
				System.out.println("Ogrenci su anda derste degil.");
			}
		}

	}

	private static void addStudent() { // OGRENCININ OLUSMASI ICIN GEREKLI BILGILER KULLANICI TARAFINDAN ALINIR

		headMaster.getStudentList().add(context.getBean("student", Student.class));

		studentList.get(studentId).setStudentId(studentId);
		Scanner scan = new Scanner(System.in);
		System.out.println("Isim giriniz: ");
		studentList.get(studentId).setName(scan.nextLine());

		int i = 1;
		while (true) {
			System.out.println("Alacagi " + i + ". dersi giriniz: (durmak icin 0 yaziniz)");
			String input = scan.nextLine();
			if (input.equals("0")) {
				break;
			}
			studentList.get(studentId).getLessons().add(input.toLowerCase());

			i++;
		}

		studentId++;
	}

}
