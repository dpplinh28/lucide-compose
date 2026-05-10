package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedMousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.034f, 12.681f)
                arcToRelative(.498f, .498f, 0f, false, true, .647f, -.647f)
                lineToRelative(9f, 3.5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.033f, .943f)
                lineToRelative(-3.444f, 1.068f)
                arcToRelative(1f, 1f, 0f, false, false, -.66f, .66f)
                lineToRelative(-1.067f, 3.443f)
                arcToRelative(.5f, .5f, 0f, false, true, -.943f, .033f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedMousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedMousePointer: ImageVector
    @Composable get() = SquareDashedMousePointerDefinition.asImageVector()
