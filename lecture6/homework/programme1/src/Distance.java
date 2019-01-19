class Distance
{
 float feet;
 float inch,dist1,dist2;

		Distance()
		{
		this.feet=0;
		this.inch=0;
		}
		Distance ( float f, float i)
		{
		this.feet=f;
		this.inch=i;
		}
		void setValuef(float f)

		{
		this.feet=f;
		}
		void setValuei(float i)
		{
		this.inch=i;
		}
		float getValuef()
		{
		return feet;
		}
		float getValuei()
		{
		return inch;
		}
		void calSum(Distance d1)
		{
		dist1= getValuef() + d1.getValuef();
		dist2=getValuei()+d1.getValuei();
			while (dist1>12)
			{
			dist1+=1;
			dist2=dist2%12;
			}
		System.out.print(" Sum is " +dist1 + " feet " +dist2+ " inches ");
		}
}
