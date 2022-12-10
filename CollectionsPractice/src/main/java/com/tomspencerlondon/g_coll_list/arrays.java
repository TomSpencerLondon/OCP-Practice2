package com.tomspencerlondon.g_coll_list;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] namesPlaces={{"Mary", "London", "Actor"},
							{"Peter","Bristol","Author"}};
		
		System.out.println(namesPlaces.length);
		//System.out.println(inputArray[0]);
		System.out.println(namesPlaces[0].length);
		for (int i=0;i<=namesPlaces.length;i++)
		{
			for(int j=0;j<namesPlaces.length;j++)
						System.out.print(namesPlaces[j][i]+""+"\t");
		
			System.out.println();
		}
		
	}

}
