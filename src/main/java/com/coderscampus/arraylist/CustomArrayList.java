package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	@Override
	public boolean add(T item) {
		 if (size == items.length) {
	            // Double the array size
	            Object[] newItems = new Object[items.length * 2];
	            System.arraycopy(items, 0, newItems, 0, items.length);
	            items = newItems;
		 }
	        items[size] = item;
	        size++;
	        return true;

	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) items[index];

	}
	
}
