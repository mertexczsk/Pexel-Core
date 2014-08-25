package me.dobrakmato.plugins.pexel.PexelCore;

import org.bukkit.entity.Player;

/**
 * Menu action that will execute specified code, when triggered.
 * 
 * @author Mato Kormuth
 * 
 */
public class JavaArbitraryAction implements Action
{
	private final ParametrizedRunnable	runnable;
	
	public JavaArbitraryAction(final ParametrizedRunnable runnable)
	{
		this.runnable = runnable;
	}
	
	@Override
	public void load(final String string)
	{
		
	}
	
	@Override
	public String save()
	{
		return null;
	}
	
	@Override
	public void execute(final Player player)
	{
		this.runnable.run(player);
	}
}