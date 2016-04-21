package sa.tetris.listener;

import sa.tetris.entities.Shape;

/**
 * Created by SarahDai on 2/25/16.
 */
public interface ShapeListener {
    void shapeMoveDown(Shape shape);

    boolean isShapeCanMoveDown(Shape shape);
}
