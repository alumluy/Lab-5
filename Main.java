import java.util.*;
public class Main {
    public static void main(String args[])
    {

        Scanner scan= new Scanner(System.in);
        double l,w,hrp,hc,d,pw,r,rc,pr,pt,a,b,c,S,Sr,Ar,Ac,C,SA,V,At,Arp,Vrp,SAc,Vc;
        System.out.println("Enter length of rectangle (positive integer):");
        l=scan.nextDouble();
        System.out.println("Enter width of rectangle (positive integer):");
        w=scan.nextDouble();
        System.out.println("Now enter the radius of the circle (positive integer):");
        r=scan.nextDouble();
        System.out.println("Enter side A of Triangle (positive integer):");
        a=scan.nextDouble();
        System.out.println("Enter side B of Triangle (positive integer):");
        b=scan.nextDouble();
        System.out.println("Enter side C of Triangle (positive integer):");
        c=scan.nextDouble();

        pr=2*(l+w);
        Ar=w*l;
        C=2*3.14*r;
        Ac=3.14*r*r;
        pt=a+b+c;
        S=(a+b+c)/2;
        At=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area of rectangle:"+Ar);
        System.out.println("Area of circle:"+Ac);
        System.out.println("Perimeter of rectangle:"+pr);
        System.out.println("Circumference of circle:"+C);
        System.out.println("Area of triangle:"+At);
        System.out.println("Perimeter of triangle:"+pt);



        System.out.println("Enter the radius of the sphere:");
        Sr=scan.nextDouble();
        System.out.println("Enter the diameter of the rectangular prism:");
        d=scan.nextDouble();
        System.out.println("Enter the height of the rectangular prism:");
        hrp=scan.nextDouble();
        System.out.println("Enter the width of the rectangular prism:");
        w=scan.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        hc=scan.nextDouble();
        System.out.println("Enter the radius of the cylinder:");
        rc=scan.nextDouble();

        SA=4*3.14*Sr*Sr;
        V=4*3.14*(Sr*Sr*Sr)/3;
        Arp=2*((hrp*d)+(hrp*w)+(d*w));
        Vrp=hrp*d*w;
        SAc=2*3.14*rc*hc+2*3.14*rc*rc;
        Vc=3.14*rc*rc*hc;
        System.out.println("The surface area of the sphere is:"+SA);
        System.out.println("The volume of the sphere is:"+V);
        System.out.println("The surface area of the rectangular prism is:"+Arp);
        System.out.println("The volume of the rectangular prism is:"+Vrp);
        System.out.println("The surface area of the cylinder is:"+SAc);
        System.out.println("The volume of the cylinder is:"+Vc);






    }
}
