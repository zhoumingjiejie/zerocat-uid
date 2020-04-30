package com.githup.icezerocat.uidprovide.service;

import com.baidu.fsg.uid.UidGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author 0.0.0
 */
@Service
public class UidGenService {
    @Resource(name = "cachedUidGenerator")
    private UidGenerator uidGenerator;

    /**
     * 获取uid
     *
     * @return uid
     */
    public long getUid() {
        return uidGenerator.getUID();
    }

    /**
     * 解析uid
     *
     * @param uid uid
     * @return uid信息
     */
    public String parseUid(long uid) {
        return uidGenerator.parseUID(uid);
    }
}
