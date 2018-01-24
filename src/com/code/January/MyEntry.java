package com.code.January;

import java.util.Map;

public class MyEntry<Character,Integer> implements Map.Entry<Character,Integer> {
	    private final Character key;
	    private Integer value;

	    public MyEntry(Character key, Integer value) {
	        this.key = key;
	        this.value = value;
	    }
	    
	    @Override
	    public Character getKey() {
	        return key;
	    }

	    @Override
	    public Integer getValue() {
	        return value;
	    }

	    @Override
	    public Integer setValue(Integer value) {
	    	Integer old = this.value;
	        this.value = value;
	        return old;
	    }

		
}
