package cn.lmjia.market.core.service.cache;

import cn.lmjia.market.core.entity.Customer;
import cn.lmjia.market.core.entity.deal.AgentSystem;
import org.springframework.transaction.annotation.Transactional;

/**
 * 人物关系缓存服务
 *
 * @author CJ
 * @see cn.lmjia.market.core.entity.cache.LoginRelation
 */
public interface LoginRelationCacheService {

    /**
     * 重建整个代理体系的缓存
     *
     * @param system 代理体系
     */
    @Transactional
    void rebuildAgentSystem(AgentSystem system);

    /**
     * 重建所有代理体系的缓存
     */
    @Transactional
    void rebuildAll();

    /**
     * @param customer 新的客户
     */
    @Transactional
    void addCustomerCache(Customer customer);

}