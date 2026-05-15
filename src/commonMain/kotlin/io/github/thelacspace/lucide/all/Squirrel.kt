package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Squirrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.236f, 22f)
                arcToRelative(3f, 3f, 0f, false, false, -2.2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 20f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 13f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
                curveToRelative(0f, -5f, 4f, -5f, 4f, -10.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -9f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
                curveTo(7f, 10f, 3f, 11f, 3f, 17f)
                curveToRelative(0f, 2.8f, 2.2f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.SquirrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Squirrel: ImageVector
    @Composable get() = SquirrelDefinition.asImageVector()
