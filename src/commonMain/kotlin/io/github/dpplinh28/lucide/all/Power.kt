package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Power") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.4f, 6.6f)
                arcToRelative(9f, 9f, 0f, true, true, -12.77f, .04f)
            }
}

public val LucideIcons.All.PowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Power: ImageVector
    @Composable get() = PowerDefinition.asImageVector()
