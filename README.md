# 重构「镀金玫瑰商店」

## 业务介绍

"镀金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

* 所有商品都有一个"SellIn"值，这是商品的保质期，最好在这么多天之内卖掉
* 所有商品都有一个"Quality"值，代表商品的价值
* 商品的"SellIn"值和"Quality"值，会随着天数的增加而变化，但是会有特例



## 作业要求

1. 根据代码情况，适当的去理解需求
2. 尝试通过【重构五步法】，进行重构
3. 小步提交，在提交信息中需要标明被识别并重构的坏味道

## Biz Analyze
Update Quality

1. Aged Brie
    - quality < 50, then +1
    - sell-in -1
    - sell-in < 0 && quality < 50, then +1 
2. Backstage passes to a TAFKAL80ETC concert
    - quality < 50, then +1
    - sell-in < 11 && quality < 50, then +1 
    - sell-in < 6 && quality < 50, then +1 
    - sell-in -1
    - sell-in < 0 then quality = 0 
3. Sulfuras, Hand of Ragnaros
    - do nothing
4. Others
    - quality > 0, then -1
    - sell-in -1
    - sell-in < 0 && quality > 0, then -1