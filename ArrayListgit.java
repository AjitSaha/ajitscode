class Arrayobject
{
    Object obj[]=new Object[10];
    int count=0;

    public void add(int ele)
    {
        if(count==obj.length)
        {
            increase();
        }
        obj[count++]=ele;
    }
    public void  increase()
    {
        Object obj1[]=new Object[obj.length+5];
        for(int i=0;i<obj.length;i++)
        {
            obj1[i]=obj[i];
        }
        obj=obj1;
    }
    public void display()
    {
        if(count==0){
          System.out.println("empty list");
          return;
        }
        for(int i=0;i<count();i++)
        {
            System.out.println(obj[i]);
        }
    }
    public int count()
    {
        return count;
    }

}
public class ArrayListgit 
{
    public static void main(String[] args) {
        Arrayobject a= new Arrayobject();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a.count());
        a.display();

    }
}
