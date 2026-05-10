package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
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
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 14f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashed: ImageVector
    @Composable get() = SquareDashedDefinition.asImageVector()
