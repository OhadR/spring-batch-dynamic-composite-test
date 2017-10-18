package com.ohadr.samples.dynamic_composite;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class TestItemWriter<T> implements ItemWriter<T>
{
    private static final Logger log = LoggerFactory.getLogger(TestItemWriter.class);

	@Override
	public void write(List<? extends T> items) throws Exception
	{
		log.info("TestItemWriter.write()");
	}

}
