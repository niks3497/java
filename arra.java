class arra
{
public static void main(String args[])
{
//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int arr[]={10,22,45,1,5};
//System.out.println("Enter the elements of array");
//for(int i=0;i<5;i++)
//arr[i]=Integer.parseInt(input.readLine());
int sum=0;
int max=arr[0];int min=arr[0];

for(int j=0;j<5;j++)
{
if(arr[j]<min)
min=arr[j];

if(arr[j]>max)
max=arr[j];

}
sum=sum+arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
System.out.println("minimum value="+min);
System.out.println("maximum value="+max);
System.out.println("sum of values="+sum);
}}