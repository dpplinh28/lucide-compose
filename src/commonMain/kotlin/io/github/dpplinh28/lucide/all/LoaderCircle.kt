package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LoaderCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -6.219f, -8.56f)
            }
}

public val LucideIcons.All.LoaderCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LoaderCircle: ImageVector
    @Composable get() = LoaderCircleDefinition.asImageVector()
