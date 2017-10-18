package com.ohadr.samples.dynamic_composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class TestItemProcessor<I> implements ItemProcessor<I, I>
{
    private static final Logger log = LoggerFactory.getLogger(TestItemProcessor.class);

	@Override
	public I process(I item) throws Exception
	{
		log.info("TestItemProcessor");
		return item;
	}

}
