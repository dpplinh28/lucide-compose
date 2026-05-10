package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
