package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Thermometer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                verticalLineToRelative(10.54f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
            }
}

public val LucideIcons.All.ThermometerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Thermometer: ImageVector
    @Composable get() = ThermometerDefinition.asImageVector()
