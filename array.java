class arra
{
public static void main(String aa[])
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int arr[]=new int[5];
System.out.println("Enter the elements of array");
int max=arr[0];int min=arr[0];
for(int i=0;i<5;i++)
arr[i]=Integer.parseInt(input.readLine());

for(int j=0;j<5;j++)
{
if(arr[j]<min)
arr[j]=min;

if(arr[j]>max)
arr[j]=max;
}
System.out.println("minimum value="+min);
System.out.println("maximum value="+max);
}}