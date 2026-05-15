package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(20.9f, 18.55f)
                lineToRelative(-8f, -15.98f)
                arcToRelative(1f, 1f, 0f, false, false, -1.8f, 0f)
                lineToRelative(-8f, 15.98f)
            }
}

public val LucideIcons.All.ConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cone: ImageVector
    @Composable get() = ConeDefinition.asImageVector()
