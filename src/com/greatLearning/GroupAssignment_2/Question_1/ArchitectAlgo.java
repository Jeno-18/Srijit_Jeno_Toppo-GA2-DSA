package com.greatLearning.GroupAssignment_2.Question_1;

import java.util.*;

public class ArchitectAlgo 
{
	static int f=1;
	public void DisplayOrder(List<constructionData> arrangement, int floors) {

		Queue<constructionData> Display=new LinkedList<>();


		System.out.println("The order of construction is as Follows :");

		for(int i=0; i<floors-1; i++)
		{
			if(i==floors-2)
			{
				Display.add(arrangement.get(i));
				Display.add(arrangement.get(i+1));

				if(Display.peek().Day<arrangement.get(i+1).Day) {
					int day=arrangement.get(i+1).Day;
					if(f>day)
					{
						LastDayCrossed(Display);
						break;
					}
					else
						printMethod(Display, day); 
					break;
				}

				else
				{
					int day=Display.peek().Day;
					if(f>day)
					{
						LastDayCrossed(Display);
						break;
					}
					printMethod(Display, day); 
					break;
				}

			}

			if(arrangement.get(i).Day>arrangement.get(i+1).Day)
			{
				Display.add(arrangement.get(i));
				continue;
			}

			if (Display.isEmpty())
			{
				Display.add(arrangement.get(i));
				int day=Display.peek().Day;
				if(f>day)
				{
					LastDayCrossed(Display);
					continue;
				}
				else
					printMethod(Display, day);
				continue;
			}


			if(arrangement.get(i).Day<arrangement.get(i+1).Day)
			{
				Display.add(arrangement.get(i));
				int day=Display.peek().Day;
				if(f>day)
				{
					LastDayCrossed(Display);
					continue;
				}
				else
					printMethod(Display, day);
				continue;
			}

		}
	}

	public void printMethod(Queue<constructionData> display,int day)
	{
		for(int j=f; j<day; j++)
		{
			System.out.println();
			System.out.println("Day: "+f);
			f++;
		}

		System.out.println();
		System.out.println("Day: "+day);
		f++;

		while(!display.isEmpty())
		{
			constructionData pr=display.poll();
			System.out.print(pr.floorSize+" ");
		}

	}

	public void LastDayCrossed(Queue<constructionData> display)
	{
		while(!display.isEmpty())
		{
			constructionData pr=display.poll();
			System.out.print(pr.floorSize+" ");
		}

	}
}
