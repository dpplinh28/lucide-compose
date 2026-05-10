package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drumstick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.4f, 15.63f)
                arcToRelative(7.875f, 6f, 135f, true, true, 6.23f, -6.23f)
                arcToRelative(4.5f, 3.43f, 135f, false, false, -6.23f, 6.23f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.29f, 12.71f)
                lineToRelative(-2.6f, 2.6f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -1.65f, 4.65f)
                arcTo(2.5f, 2.5f, 0f, true, false, 8.7f, 18.3f)
                lineToRelative(2.59f, -2.59f)
            }
}

public val LucideIcons.All.DrumstickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drumstick: ImageVector
    @Composable get() = DrumstickDefinition.asImageVector()
