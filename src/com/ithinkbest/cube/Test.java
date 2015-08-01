package com.ithinkbest.cube;

public class Test {
	public static void main(String[] args) {
//		test1();
//		test2();
		
		cmd();
	}
	
	public static void cmd(){
		Rubik rubik=new Rubik();
		String welcome="=== Welcome to Rubik's Cube ===";
		String str=".紅藍黃橘綠白";
		System.out.println(welcome);
		System.out.println(rubik.getFaceColorTextImg(str));
		
//		int k=0;
		rubik.rotateShowNameAndResult(0);
		rubik.rotateShowNameAndResult(9);
		rubik.rotateShowNameAndResult(18);
		
//		System.out.println(Rubik.ROTATE_NAME[k][0]);
//		System.out.println(Rubik.ROTATE_NAME[k][1]);
//		
//		System.out.println(rubik.getFaceColorTextImg(str));
		for (int i=0;i<27;i++){
			System.out.printf("%2d %s %s \n",i,Rubik.ROTATE_NAME[i][0],Rubik.ROTATE_NAME[i][1]);
		}
		
		
		
	}
	
	public static void test1(){
		System.out.println("=== basic cube ===");
		Cube cube=new Cube();
		System.out.println(cube);
		cube.rotate(0);
		System.out.println(cube);
		cube.setIsFace(new boolean[]{true,true,true,false,false,false} );
		System.out.println(cube);
		
	}
	public static void test2(){
		System.out.println("=== Rubik ===");
		Rubik rubik=new Rubik();
		System.out.println( rubik.getFaceColor());
		rubik.rotate(0);
		System.out.println( rubik.getFaceColor());
		System.out.println( rubik.getFaceColorTextImg());
		System.out.println( rubik.getFaceColorTextImg(".RBYogw"));
		System.out.println( rubik.getFaceColorTextImg(".紅藍黃橘綠白"));
		
	}
	
}
