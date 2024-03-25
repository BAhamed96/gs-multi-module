package com.example.common.domain;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ObjectMapperUtils {	
	private static ModelMapper modelMapperStrict = new ModelMapper();
	
	static {
		modelMapperStrict.getConfiguration().setAmbiguityIgnored(true);
		modelMapperStrict.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	public static <Z, Y> Y map(final Z entity, Class<Y> mappedClass) {
		if(entity == null) {
			return null;
		}
		return modelMapperStrict.map(entity, mappedClass);	
	}
	
	public static<S, D> D map(final S source, D destination, ModelMapper modelMapper) {
		if(source == null) {
			return null;
		}
		modelMapper.map(source, destination);
		return destination;
	}
	
	public static <S, D> D map(final S source, D destination) {
		return map(source,destination, modelMapperStrict);
	}
	
	public static <Z, Y> List<Z> mapAll(final Collection<Y> entityList, Class<Z> mappedClass){
		if(entityList == null) {
			return null;
		}
		return entityList.stream().map(entity -> map(entity, mappedClass)).collect(Collectors.toList());
	}
}
