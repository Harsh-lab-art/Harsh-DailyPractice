class index
{
    public String count(String s)
    {
        for(char ch='Z';ch>='A';ch--)
        {
            if(s.indexOf(ch)!=-1 && s.indexOf(Character.toLowerCase(ch))!=-1)
            {
                return String.valueOf(ch);
            }
        }
        return "";
    }
    public static void main(String []args)
    {
        index obj=new index();
        String s="tyuuEnEbESSSuissseee";
        String n=obj.count(s);
        System.out.println(n);
    }
}