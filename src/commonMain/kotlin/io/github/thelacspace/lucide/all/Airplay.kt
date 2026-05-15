package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Airplay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 17f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 15f)
                lineToRelative(5f, 6f)
                horizontalLineTo(7f)
                close()
            }
}

public val LucideIcons.All.AirplayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Airplay: ImageVector
    @Composable get() = AirplayDefinition.asImageVector()
