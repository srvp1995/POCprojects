package com.srv.anno;


class Testt {
	@TestFun
	public static void m1() {
	}

	@TestFun
	public static void m2() {
	}

	@TestFun
	public static void m3() {
		throw new RuntimeException("Boom");
	}

	public static void m4() {
	}

	@TestFun
	public static void m5() {
	}

	public static void m6() {
	}

	@TestFun
	public static void m7() {
		throw new RuntimeException("Crash");
	}

	public static void m8() {
	}
}
