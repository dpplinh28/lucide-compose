package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedTopSolid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
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
                moveTo(3f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedTopSolidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedTopSolid: ImageVector
    @Composable get() = SquareDashedTopSolidDefinition.asImageVector()
