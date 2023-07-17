package colections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(2);
//        list.add(4);
//
//        System.out.println(list);
//        System.out.println(list.get(0) + list.get(list.size()-1));

//        list.remove((Integer) 2);
//        System.out.println(list);

//        list.removeIf(x->x.equals(2));
//        System.out.println(list);

//        list.removeIf(x -> x % 2 != 0);
//        System.out.println(list);


//        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,6,7,2,6,45,2,5,6,1));
//        System.out.println(list2);
//
//          list.addAll(list2);
//        System.out.println(list);
//
//        list.addAll(2, list2);
//        System.out.println(list);
//
//        list.set(3, 99);
//        System.out.println(list);
//        System.out.println(list.contains(99));
//
//        list.removeAll(Arrays.asList(4,6));
//        System.out.println(list);
//
//
//        ((ArrayList<Integer>) list).trimToSize();
//
//        ((ArrayList<Integer>) list).ensureCapacity(1000);

//        List<String> stringList = new ArrayList<>();
//        stringList.addAll(Arrays.asList("Россия","США", "Германия","Франция","Италия"));
//        System.out.println(stringList);
//        stringList.removeIf(x->x.endsWith("ия"));
//        System.out.println(stringList);


//        LinkedList<String> linkedList1  = new LinkedList<>();
//        linkedList1.addAll(stringList);
//        System.out.println(linkedList1);
//        linkedList1.addFirst("Белорусия");
////        linkedList1.add(0,"Белорусия");
//        System.out.println(linkedList1);

//        long timeBegin = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
//            stringList.add("Белорусия");
//        }
//
//        System.out.println(" time: "+(System.currentTimeMillis() - timeBegin));


//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }

//        for (String s : linkedList1) {
//            System.out.println(s);
//        }

//        Iterator<String> iterator = linkedList1.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        ListIterator<String> listIterator = linkedList1.listIterator(3);
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

//        linkedList1.sort(Comparator.naturalOrder());
//        linkedList1.sort(Comparator.reverseOrder());
//        System.out.println(linkedList1);


//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
//        Set<Integer> set = new LinkedHashSet<>();
//
//        set.addAll(Arrays.asList(4, 677, 276, 33, 7, 33, 4, 2, 33, 2));
//        System.out.println(set);
//        set.add(25);
//        System.out.println(set);

//        Set<Integer> setA = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.println("A= " + setA);
//        Set<Integer> setB = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
//        System.out.println("B= " + setB);
//
//        setA.addAll(setB);
//        System.out.println("A + B= " + setA);
//
////        setA.retainAll(setB);
////        System.out.println("A * B= " + setA);
//
//        setA.removeAll(setB);
//        System.out.println("A - B= " + setA);


        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();

//        map.put("Vaska", 3);
//        map.put("Murka", 4);
//        map.put("Barsik", 2);
//        map.put("Murka", 7);
//
//        System.out.println(map);
//
//        map.forEach((k, v) -> {
//            System.out.println("key = " + k + " value = " + v);
//        });

//        for (Map.Entry<String, Integer> entry: map.entrySet() ) {
//            System.out.println("key = " + entry.getKey() + " value = "+ entry.getValue());
//        }


//        Set<String> keys =  map.keySet();
//        Collection<Integer> values = map.values();
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();


        Random random = new Random();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
//            Integer count = hm.get(num);
//            hm.put(num, count == null ? 1 : count + 1);

            hm.put(num, hm.getOrDefault(num,0) + 1);
        }


        System.out.println(hm);

        "ghj".hashCode();

    }
}
