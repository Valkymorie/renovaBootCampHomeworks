package com.renova.patterns.prototype;

public interface IOgrenciCloneable extends Cloneable{ //CLONE YETENEGINI KAZANDIRAN ARAYUZ
	
	Ogrenci clone() throws CloneNotSupportedException;

}
