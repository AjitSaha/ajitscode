class ArrayListgit 
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
        for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }
    }
    public int count()
    {
        return count;
    }

}
public class Arrayobject
{
    
}
