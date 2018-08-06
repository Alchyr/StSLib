package com.evacipated.cardcrawl.mod.stslib.actions.common;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.CardGroup;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

import java.util.function.Predicate;

public class FetchAction extends MoveCardsAction
{
    public FetchAction(CardGroup source, Predicate<AbstractCard> predicate, int amount)
    {
        super(AbstractDungeon.player.hand, source, predicate, amount);
    }

    public FetchAction(CardGroup source, Predicate<AbstractCard> predicate)
    {
        this(source, predicate, 1);
    }

    public FetchAction(CardGroup source, int amount)
    {
        this(source, c -> true, amount);
    }

    public FetchAction(CardGroup source)
    {
        this(source, c -> true, 1);
    }
}