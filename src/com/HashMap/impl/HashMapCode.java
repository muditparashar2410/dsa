package com.HashMap.impl;
import java.lang.reflect.Array;
import java.util.*;
public class HashMapCode {
	static class HashMap<K,V>{
		private class Node{
			K key ;
			V value;
			public Node(K key , V value) {
				this.key = key;
				this.value=value;
			}
		}
		private int n ; //toal nodes
		private int N ; // buckets
		private LinkedList<Node> buckets[];
		
		@SuppressWarnings("unchecked")
		public HashMap() {
		this.N=4;
		this.buckets=new LinkedList[4];
		for(int i = 0 ; i <4 ; i ++ ) {
			buckets[i] = new LinkedList<>();
		}
		}
		private int hashFunction(K key) {
			int bi =key.hashCode();
			return  Math.abs(bi)%N;
		}
		private int searchInLL(K Key, int bi) {
			LinkedList<Node> ll= buckets[bi];
			int di = 0;
			for(int i = 0 ; i < ll.size();i++) {
				if(ll.get(i).key==Key) {
					return i;
				}
			}
			return -1; 
		}
		@SuppressWarnings("unchecked")
		private void reshash() {
			LinkedList<Node> oldbucket[] = buckets;
			buckets = new LinkedList[N*2];
			for(int i = 0 ; i < N*2;i++) {
				buckets[i]=new LinkedList<>();
			}
			for(int i = 0 ; i < oldbucket.length;i++) {
				LinkedList<Node> ll = oldbucket[i];
				for(int j =0 ; j < ll.size();j++) {
					Node node = ll.get(j);
					put(node.key, node.value);
				}
			}
		}
		public void put(K key , V value) {
			int bi = hashFunction(key);
			int di =searchInLL(key,bi);
			if(di==-1) { //key doesnt exist
				buckets[bi].add(new Node(key, value));
				n++;
			}else { // key exist
				Node data = buckets[bi].get(di);
				data.value=value;
			}
			double lambda = (double)n/N;
			if(lambda>2.0) {
				reshash();
			}
		}
		public V remove(K key) {
			int bi = hashFunction(key);
			int di =searchInLL(key,bi);
			if(di==-1) { //key doesnt exist
				return null;
			}else { // key exist
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			for(int i =0 ; i < buckets.length;i++) { //bi
				LinkedList<Node> ll = buckets[i];
				for(int j = 0 ; j < ll.size();j++) { //di
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}
		public boolean isEmpty() {
			return n==0;
		}
		public boolean containsKey(K key) {
			int bi = hashFunction(key);
			int di =searchInLL(key,bi);
			if(di==-1) { //key doesnt exist
				return false;
			}else { // key exist
				return true;
			}
		}
		public V get(K key) {
			int bi = hashFunction(key);
			int di =searchInLL(key,bi);
			if(di==-1) { //key doesnt exist
			return null;
			}else { // key exist
				Node node = buckets[bi].get(di);
				return node.value;
			}
		}
		
		public static void main(String[] args) {
			HashMap<String, Integer> map = new HashMap<>();
			map.put("India", 100);
			map.put("China", 150);
			map.put("USA", 50);
			ArrayList<String> keys=map.keySet();
			for(int i = 0 ; i < keys.size();i++) {
				System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
			}
			map.remove("India");
			System.out.println(map.get("India"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
