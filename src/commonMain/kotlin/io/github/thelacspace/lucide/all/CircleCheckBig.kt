package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleCheckBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.801f, 10f)
                arcTo(10f, 10f, 0f, true, true, 17f, 3.335f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(3f, 3f)
                lineTo(22f, 4f)
            }
}

public val LucideIcons.All.CircleCheckBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleCheckBig: ImageVector
    @Composable get() = CircleCheckBigDefinition.asImageVector()
