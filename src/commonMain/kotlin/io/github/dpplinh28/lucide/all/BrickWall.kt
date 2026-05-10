package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 9f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 15f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.BrickWallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWall: ImageVector
    @Composable get() = BrickWallDefinition.asImageVector()
