package com.yeauty.service.impl;

import com.yeauty.component.CostLogger;
import com.yeauty.service.ShowService;
import org.springframework.stereotype.Service;

/**
 * @author Yeauty
 * @version 1.0
 * @Description:show effect
 * @date 2018/5/10 10:30
 */
@Service
public class ShowServiceImpl implements ShowService {

    @CostLogger(LEVEL = CostLogger.Level.INFO)
    @Override
    public void show() {
        for (int i = 0; i < 1024 * 1024; i++) {
        }
    }
}



