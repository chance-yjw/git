package com.yu.entity;

public class Bule {
	private String BuleChang;
	private String BuleTang;
	private String BuleRap;
	private int BuleChangs;
	private int BuleTangs;
	private int BuleRaps;

	public int getBuleChangs() {
		return BuleChangs;
	}

	public void setBuleChangs(int buleChangs) {
		BuleChangs = buleChangs;
	}

	public int getBuleTangs() {
		return BuleTangs;
	}

	public void setBuleTangs(int buleTangs) {
		BuleTangs = buleTangs;
	}

	public int getBuleRaps() {
		return BuleRaps;
	}

	public void setBuleRaps(int buleRaps) {
		BuleRaps = buleRaps;
	}

	public String getBuleChang() {
		return BuleChang;
	}

	public void setBuleChang(String buleChang) {
		BuleChang = buleChang;
	}

	public String getBuleTang() {
		return BuleTang;
	}

	public void setBuleTang(String buleTang) {
		BuleTang = buleTang;
	}

	public String getBuleRap() {
		return BuleRap;
	}

	public void setBuleRap(String buleRap) {
		BuleRap = buleRap;
	}

	public Bule(String buleChang, String buleTang, String buleRap) {
		super();
		BuleChang = buleChang;
		BuleTang = buleTang;
		BuleRap = buleRap;
	}

	public Bule() {
		super();
	}

	public Bule(String buleChang, String buleTang, String buleRap, int buleChangs, int buleTangs, int buleRaps) {
		super();
		BuleChang = buleChang;
		BuleTang = buleTang;
		BuleRap = buleRap;
		BuleChangs = buleChangs;
		BuleTangs = buleTangs;
		BuleRaps = buleRaps;
	}

}
