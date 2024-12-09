package oop39;

public class Point3D{
    private short x;
    private short y;
    private short z;

    public Point3D(int x,int y,int z){
        this.x=(short)x;
        this.y=(short)y;
        this.z=(short)z;
    }

    public void setX(short x){
        this.x=x;
    }

    public short getX(){
        return this.x;
    }

    public void setY(short y){
        this.y=y;
    }

    public short getY(){
        return this.y;
    }

    public void setZ(short z){
        this.z=z;
    }

    public short getZ(){
        return this.z;
    }

    public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        return Vector.undirection(Vector.direction(new Vector(p1,p2),new Vector(p1,p3)),new Vector(p1,p4))==0;
    }
}
