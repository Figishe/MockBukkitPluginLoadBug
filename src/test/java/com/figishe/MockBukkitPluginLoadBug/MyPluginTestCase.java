package com.figishe.MockBukkitPluginLoadBug;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.WorldMock;
import org.bukkit.Material;
import org.bukkit.World;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyPluginTestCase
{

    private ServerMock server;
    private World world;
    private MyPlugin plugin;

    @BeforeAll
    public void setUp()
    {
        server = MockBukkit.mock();
        world = new WorldMock(Material.DIRT, 3);
        plugin = MockBukkit.load(MyPlugin.class);
    }

    @AfterAll
    public void tearDown()
    {
        // Stop the mock server
        MockBukkit.unmock();
    }

    @Test
    public void test()
    {
        Assertions.assertTrue(plugin != null);
    }

}
