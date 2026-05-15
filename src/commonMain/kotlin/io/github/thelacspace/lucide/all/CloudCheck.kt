package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 15f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(9f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.516f, 16.07f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 3.501f, 7.327f)
            }
}

public val LucideIcons.All.CloudCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudCheck: ImageVector
    @Composable get() = CloudCheckDefinition.asImageVector()
