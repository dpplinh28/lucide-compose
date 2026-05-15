package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.94f, 5.274f)
                arcTo(7f, 7f, 0f, false, true, 15.71f, 10f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 4.222f, 6.057f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.796f, 18.81f)
                arcTo(4.5f, 4.5f, 0f, false, true, 17.5f, 19f)
                horizontalLineTo(9f)
                arcTo(7f, 7f, 0f, false, true, 5.79f, 5.78f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.CloudOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudOff: ImageVector
    @Composable get() = CloudOffDefinition.asImageVector()
