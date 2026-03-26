package prog1;
import java.util.*;
public class prog1 {

	public static void main(String[] args) {
Scanner oku=new Scanner (System.in);
int saniye,d,s,g,t=0;
System.out.print("Lütfen saniye gir");
saniye=oku.nextInt();
d=saniye/60;
s=d/60;
g=s/24;
s=s%24;
d=d%60;
saniye=saniye%60;
System.out.println(g+"-gun");
System.out.println(s+"-saat");
System.out.println(d+"-dakika");
System.out.println(saniye+"-saniye");
	}

}
