package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998f, 9.003f)
                arcToRelative(5f, 5f, 0f, true, false, 8f, -.005f)
            }
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
}

public val LucideIcons.All.SquarePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePower: ImageVector
    @Composable get() = SquarePowerDefinition.asImageVector()
