package com.sprint;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.assertj.core.api.Assertions.assertThat;
import com.sprint.dao.IPlantRepository;
import com.sprint.entities.Plant;
import com.sprint.serviceImpl.PlantServiceImpl;

public class IPlantServiceTest {
	@Mock
	private IPlantRepository repository;
	@InjectMocks
	private PlantServiceImpl plantService;

	@Test
	public void savePlantTest() {
		Plant plan = new Plant(1, 15, "spread", "rose", "morning", "medicine", "normal", "50", "hybrid", "beautiful",
				20, 200);
		when(repository.save(plan)).thenReturn(plan);
		assertEquals(plan, plantService.addPlant(plan));
	}

	@Test
	public void viewPlantByIdTest() {
		int plantId = 1;
		when(repository.findById(plantId)).thenReturn(Optional.of(new Plant(1, 15, "news", "rose", "morning",
				"medicine", "normal", "50", "hybrid", "beautiful", 20, 200)));
		assertEquals("news", plantService.viewPlant(plantId).getPlantSpread());
	}

	@Test
	public void viewAllTypeOfPlantTest() {
		String typeOfPlant = "hybrid";
		when(repository.findAllByTypeOfPlant(typeOfPlant)).thenReturn(Stream.of(new Plant(1, 15, "spread", "rose",
				"morning", "medicine", "normal", "50", "hybrid", "beautiful", 20, 200)).collect(Collectors.toList()));
		assertEquals(1, plantService.viewAllPlants(typeOfPlant).size());
	}

	@Test
	public void testDelete() {
		repository.deleteById(1);
		assertThat(repository.existsById(1)).isFalse();
	}

	@Test
	public void viewAllPlantTest() {
		when(repository.findAll()).thenReturn(Stream.of(
				new Plant(1, 15, "spread", "rose", "morning", "medicine", "normal", "50", "hybrid", "beautiful", 20,
						200),
				new Plant(2, 15, "spread", "rose", "morning", "medicine", "normal", "50", "hybrid", "beautiful", 20,
						200))
				.collect(Collectors.toList()));
		assertEquals(2, plantService.viewAllPlants().size());

	}
}}
