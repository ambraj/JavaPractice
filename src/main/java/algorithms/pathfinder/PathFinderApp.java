package algorithms.pathfinder;

import java.util.*;

public class PathFinderApp {

    public static void main(String[] args) {
        int startIndex = new Random().nextInt(15);
        int endIndex;
        do {
            endIndex = new Random().nextInt(15);
        } while (startIndex == endIndex);

        Slot startSlot = createSlot(startIndex);
        Slot endSlot = createSlot(endIndex);
        Slot firstSlot, secondSlot;
        List<Slot> possibleSlots;

        if (startSlot.getX() == endSlot.getX() && startSlot.getY() != endSlot.getY()) {
            possibleSlots = getPossibleSlotsX(startSlot, endSlot);
            Collections.shuffle(possibleSlots);

            firstSlot = possibleSlots.get(0);

            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            secondSlot.setY(endSlot.getY());
        } else if (startSlot.getY() == endSlot.getY() && startSlot.getX() != endSlot.getX()) {
            possibleSlots = getPossibleSlotsY(startSlot, endSlot);
            Collections.shuffle(possibleSlots);

            firstSlot = possibleSlots.get(0);

            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            secondSlot.setX(endSlot.getX());
        } else {
            possibleSlots = getPossibleSlotsX(startSlot, endSlot);
            possibleSlots.addAll(getPossibleSlotsY(startSlot, endSlot));

            possibleSlots = new ArrayList<>(new HashSet<>(possibleSlots));
            Collections.shuffle(possibleSlots);

            firstSlot = possibleSlots.get(0);

            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            if (startSlot.getX() == firstSlot.getX()) {
                secondSlot.setX(endSlot.getX());
            } else {
                secondSlot.setY(endSlot.getY());
            }
        }

        System.out.println("Path : " + getSlotIndex(startSlot) + " -> " + getSlotIndex(firstSlot) + " -> " + getSlotIndex(secondSlot) + " -> " + getSlotIndex(endSlot));
    }

    public static List<Slot> getPossibleSlotsX(Slot startSlot, Slot endSlot) {
        List<Slot> xSlots = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i == startSlot.getX() || i == endSlot.getX()) {
                continue;
            }
            xSlots.add(new Slot(i, startSlot.getY()));
        }
        return xSlots;
    }

    public static List<Slot> getPossibleSlotsY(Slot startSlot, Slot endSlot) {
        List<Slot> ySlots = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (i == startSlot.getY() || i == endSlot.getY()) {
                continue;
            }
            ySlots.add(new Slot(startSlot.getX(), i));
        }
        return ySlots;
    }

    private static int getSlotIndex(Slot slot) {
        return slot.getX() % 5 + slot.getY() * 5;
    }

    private static Slot createSlot(int slotIndex) {
        return new Slot(slotIndex % 5, slotIndex / 5);
    }

}
