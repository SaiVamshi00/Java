   HashMap<Integer,Integer>map=new HashMap<>();
		   for(i=0;i<n;i++){                                                    
		       if(map.containsKey(a[i])){                              
		           map.put(a[i],map.get(a[i])+1); //incerementing the value of the key if it is present in the hash
		       }
		       else
		       map.put(a[i],1);//else assinging the 1 and adding new key into the hash
		   }
		   //System.out.println(map);
		   int flag=1;
		   for(int key :map.keySet())// this is the way of taking every key value using keySet() method
		     {
		         //System.out.println(key);
		         if(key!=map.get(key)){
		         System.out.println("no");
		  //System.out.println(key+" "+map.get(key));      
		         flag=0;
		         break;
		         }
		     }

//no duplicate keys in the map
