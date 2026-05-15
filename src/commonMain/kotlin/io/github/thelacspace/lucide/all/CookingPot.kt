package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CookingPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 8f)
                lineToRelative(16f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.86f, 6.78f)
                lineToRelative(-.45f, -1.81f)
                arcToRelative(2f, 2f, 0f, false, true, 1.45f, -2.43f)
                lineToRelative(1.94f, -.48f)
                arcToRelative(2f, 2f, 0f, false, true, 2.43f, 1.46f)
                lineToRelative(.45f, 1.8f)
            }
}

public val LucideIcons.All.CookingPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CookingPot: ImageVector
    @Composable get() = CookingPotDefinition.asImageVector()
