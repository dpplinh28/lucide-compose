package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Candy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 7f)
                verticalLineToRelative(10.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 6.1f)
                verticalLineTo(17f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.707f, -.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.152f, .717f)
                arcToRelative(1f, 1f, 0f, false, true, 1.131f, 1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, .717f, 2.152f)
                arcTo(1f, 1f, 0f, false, true, 21f, 8f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.536f, 7.465f)
                arcToRelative(5f, 5f, 0f, false, false, -7.072f, 0f)
                lineToRelative(-2f, 2f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 7.07f)
                arcToRelative(5f, 5f, 0f, false, false, 7.072f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -7.07f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 17f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.707f, .707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.152f, -.717f)
                arcToRelative(1f, 1f, 0f, false, true, -1.131f, -1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -.717f, -2.152f)
                arcTo(1f, 1f, 0f, false, true, 3f, 16f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.CandyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Candy: ImageVector
    @Composable get() = CandyDefinition.asImageVector()
