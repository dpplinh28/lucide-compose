package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998f, 9.003f)
                arcToRelative(5f, 5f, 0f, true, false, 8f, -.005f)
            }
}

public val LucideIcons.All.CirclePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePower: ImageVector
    @Composable get() = CirclePowerDefinition.asImageVector()
