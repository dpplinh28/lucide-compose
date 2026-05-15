package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CandyOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                verticalLineToRelative(7.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.802f, 6.145f)
                arcToRelative(5f, 5f, 0f, false, true, 6.053f, 6.053f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 6.1f)
                verticalLineToRelative(2.243f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.5f, 15.571f)
                lineToRelative(-.964f, .964f)
                arcToRelative(5f, 5f, 0f, false, true, -7.071f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, -7.07f)
                lineToRelative(.964f, -.965f)
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
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
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

public val LucideIcons.All.CandyOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CandyOff: ImageVector
    @Composable get() = CandyOffDefinition.asImageVector()
