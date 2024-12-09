package oop39;

public class Vector{
    private int x;
    private int y;
    private int z;

    public Vector(Point3D p1,Point3D p2){
        this.x=(int)p2.getX()-p1.getX();
        this.y=(int)p2.getY()-p1.getY();
        this.z=(int)p2.getZ()-p1.getZ();
    }

    public Vector(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y=y;
    }

    public int getY(){
        return this.y;
    }

    public void setZ(int z){
        this.z=z;
    }

    public int getZ(){
        return this.z;
    }

    public static Vector direction(Vector v1,Vector v2){
        return new Vector(v1.y*v2.z-v1.z*v2.y,v1.z*v2.x-v1.x*v2.z,v1.x*v2.y-v1.y*v2.x);
    }

    public static int undirection(Vector v1,Vector v2){
        return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
    }
}